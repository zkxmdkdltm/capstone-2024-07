package com.dclass.backend.application

import com.dclass.backend.domain.user.User
import com.dclass.backend.domain.user.UserRepository
import com.dclass.backend.domain.user.findByEmail
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Transactional
@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getByEmail(email: String): User {
        return userRepository.findByEmail(email) ?: throw IllegalArgumentException("회원이 존재하지 않습니다. email: $email")
    }
}