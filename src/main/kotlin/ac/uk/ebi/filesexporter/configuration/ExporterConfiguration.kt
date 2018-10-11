package ac.uk.ebi.filesexporter.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "exporter")
class ExporterConfiguration {
    lateinit var filePath: String
}
