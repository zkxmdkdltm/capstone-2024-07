package com.dclass.backend.domain.community

import com.dclass.support.domain.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.SQLRestriction

@SQLDelete(sql = "update community set deleted = true where id = ?")
@SQLRestriction("deleted = false")
@Entity
class Community(
    @Column(nullable = false)
    val departmentId: Long,

    title: String = "",

    description: String = "",

    id: Long = 0L,
) : BaseEntity(id) {

    @Column(nullable = false)
    private var deleted: Boolean = false

    @Column(nullable = false, length = 100)
    var title: String = title
        private set

    @Column(nullable = false, length = 255)
    var description: String = description
        private set
}
