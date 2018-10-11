package ac.uk.ebi.filesexporter.model

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Attribute {
    @Id
    @GeneratedValue
    var id: Long = 0L

    @Id
    @Column
    var name: String = ""

    @Column(name = "nameQualifierString")
    var nameQualifier: String? = null

    @Column
    var reference: Boolean? = null

    @Column
    var value: String = ""

    @Column(name = "valueQualifierString")
    var valueQualifier: String? = null

    @Column(name = "ord")
    var order: Int = 0
}
