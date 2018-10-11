package ac.uk.ebi.filesexporter.model

import javax.persistence.*

@Entity
@Table(name = "FileRef")
data class File(
        @Id
        @GeneratedValue
        var id: Long = 0L,

        @Column
        var name: String = "",

        @Column
        var size: Int = 0,

        @Column
        var tableIndex: Int = -1,

        @Column(name = "ord")
        var order: Int = 0,

        @Column
        var path: String = ""){

    @OneToMany
    @JoinColumn(name = "file_id")
    @OrderBy("order ASC")
    lateinit var attributes: MutableSet<FileAttribute>
}
