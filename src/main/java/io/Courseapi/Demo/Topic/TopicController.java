package io.Courseapi.Demo.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return  topicService.getTopics();
    }

    @RequestMapping("/topics/{Id}")
    public Topic getTopic(@PathVariable String Id){
        return topicService.getTopic(Id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{Id}")
    public void update(@RequestBody Topic topic,@PathVariable String Id){
        topicService.update(topic,Id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{Id}")
    public void deleteTopic(@PathVariable String Id){
         topicService.deleteTopic(Id);
    }
}
