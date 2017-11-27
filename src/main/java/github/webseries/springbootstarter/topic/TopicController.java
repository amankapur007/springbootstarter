package github.webseries.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopic() {
		return Arrays.asList(new Topic("spring", "Spring Framework", "The tutorial for spring framework"),
				new Topic("java", "Core Java", "The tutorial for core java"),
				new Topic("javascript", "Javascript", "The tutorial for javascript"));
	}
}
