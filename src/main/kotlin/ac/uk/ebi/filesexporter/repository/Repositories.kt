package ac.uk.ebi.filesexporter.repository

import ac.uk.ebi.filesexporter.model.File
import org.springframework.data.repository.CrudRepository

interface FileRepository: CrudRepository<File, Long>
