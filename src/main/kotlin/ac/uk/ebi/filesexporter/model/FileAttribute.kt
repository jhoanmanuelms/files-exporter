package ac.uk.ebi.filesexporter.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class FileAttribute(

        @ManyToOne
        @JoinColumn(name = "file_id")
        var file: File

) : Attribute(), Serializable
