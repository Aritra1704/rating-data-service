package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public List<Rating> getRating(@PathVariable("movieId") String movieId) {
        return Collections.singletonList(
                new Rating(movieId, 4)
        );
    }
}
