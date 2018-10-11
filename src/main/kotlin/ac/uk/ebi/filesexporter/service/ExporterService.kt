package ac.uk.ebi.filesexporter.service

import ac.uk.ebi.filesexporter.configuration.ExporterConfiguration
import ac.uk.ebi.filesexporter.model.File
import ac.uk.ebi.filesexporter.repository.FileRepository
import org.springframework.stereotype.Component
import java.io.OutputStream
import java.nio.file.Files
import java.nio.file.Paths

@Component
class ExporterService (val config: ExporterConfiguration, val fileRepository: FileRepository) {
    fun export() {
        val files: MutableIterable<File> = fileRepository.findAll()
        val out: OutputStream = Files.newOutputStream(Paths.get(config.filePath + "/files.json"))

        files.forEach {
            out.write(it.name.toByteArray())
        }
    }
}

