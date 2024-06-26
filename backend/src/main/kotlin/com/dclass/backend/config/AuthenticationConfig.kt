package com.dclass.backend.config

import com.dclass.backend.security.AuthTokenResolver
import com.dclass.backend.security.LoginUserResolver
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AuthenticationConfig(
    private val loginUserResolver: LoginUserResolver,
    private val authTokenResolver: AuthTokenResolver,
) : WebMvcConfigurer {
    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        resolvers.add(loginUserResolver)
        resolvers.add(authTokenResolver)
    }
}
