package ac.uk.ebi.filesexporter.controller

import ac.uk.ebi.filesexporter.service.ExporterService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/exporter")
class ExporterController(val exporter: ExporterService) {
    @PostMapping("/export")
    fun exportController() {
        exporter.export()
    }
}
