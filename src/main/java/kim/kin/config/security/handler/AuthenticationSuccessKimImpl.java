package kim.kin.config.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import kim.kin.config.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class AuthenticationSuccessKimImpl implements AuthenticationSuccessHandler {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {

        User user = (User) authentication.getPrincipal();
        String token = jwtTokenUtil.generateToken(user.getUsername(), user.getAuthorities());
//        response.setHeader("Bearer Token", token);
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        Map<String, Object> authInfo = new HashMap<>(1) {{
            put("token", JwtTokenUtil.AUTH_KIM_TOKEN + token);
        }};
        writer.write(new ObjectMapper().writeValueAsString(authInfo));
    }
}