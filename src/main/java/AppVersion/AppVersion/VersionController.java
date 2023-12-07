package AppVersion.AppVersion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VersionController {

    @GetMapping("/version")
    public ResponseEntity<Version> getVersion() {
        Version Version = new Version();
        Version.setVersionNumber("1.0");
        Version.setReleaseDate("2023-11-18");
        return new ResponseEntity<>(Version, HttpStatus.OK);
    }
}