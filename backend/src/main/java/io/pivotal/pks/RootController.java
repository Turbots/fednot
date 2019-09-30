package io.pivotal.pks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private final PodInformation podInformation;

    public RootController(PodInformation podInformation) {
        this.podInformation = podInformation;
    }

    @GetMapping("/")
    public PodInformation getPodInformation() {
        return this.podInformation;
    }
}
