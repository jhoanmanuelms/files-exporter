package ac.uk.ebi.filesexporter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FilesExporterApplication

fun main(args: Array<String>) {
    runApplication<FilesExporterApplication>(*args)
}
