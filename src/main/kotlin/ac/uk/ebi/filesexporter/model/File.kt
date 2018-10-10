package ac.uk.ebi.filesexporter.model

data class File(
        val id: Long,
        val path: String,
        val name: String,
        val size: Long,
        val type: String,
        val attributes: List<Attribute>)
