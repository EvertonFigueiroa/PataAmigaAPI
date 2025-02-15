package com.example.kotlindemo.model

import org.mindrot.jbcrypt.BCrypt
import org.springframework.lang.Nullable
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.NotBlank

@Entity
data class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @get: NotBlank
    val name: String = "",

    @get: NotBlank
    val email: String = "",

    @get: NotBlank
    var password: String = "",

    @get: NotBlank
    val birth: String = "",

    @get: NotBlank
    val location: String = "",

    @Column(name = "profile_pic")
    val profilePic: String = "",

    @get: NotBlank
    val banner: String = "",

    @get: NotBlank
    val phone: String = "",

    @Nullable
    val instagram: String?,

    @Nullable
    val facebook: String?,

    @Nullable
    val whatsapp: String?,

    @OneToMany(targetEntity = PostPets::class, cascade = [CascadeType.ALL], orphanRemoval = true)
    val postPets: List<PostPets>
)