package ru.kpfu.itis.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entity.ClientEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.repository.ClientRepository;
import ru.kpfu.itis.repository.StaffRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    StaffRepository staffRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        ClientEntity user = clientRepository.findOneByLogin(login);
        StaffEntity staff = staffRepository.findOneByLogin(login);

        if (user == null) {
            if (staff == null) {
                throw new UsernameNotFoundException("user not found");
            }
        }

        String password = authentication.getCredentials().toString();

        if (user != null && user.getPassword() != null){
            if (!encoder.matches(password, user.getPassword())) {
                throw new BadCredentialsException("invalid password");
            }
        }

        if (staff != null && staff.getPassword() != null){
            if (!encoder.matches(password, staff.getPassword())) {
                throw new BadCredentialsException("invalid password");
            }
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (user != null) {
            authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
        }

        if (staff != null) {
            authorities.add(new SimpleGrantedAuthority(staff.getRole().toString()));
        }

        UsernamePasswordAuthenticationToken person = null;

        if (user != null) {
            person = new UsernamePasswordAuthenticationToken(user, null, authorities);
        }

        if (staff != null) {
            person = new UsernamePasswordAuthenticationToken(staff, null, authorities);
        }

        return person;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
