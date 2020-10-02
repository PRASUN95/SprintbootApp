package io.Courseapi.Demo.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("S","Spring","Spring Desc"),
            new Topic("J","Java","Java Desc"),
            new Topic("RJS","React Js","React JS Desc")
    ));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String Id){
        return topics.stream().filter(x -> x.getId().equals(Id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void update(Topic topic,String Id){
        for(int i=0;i<topics.size();i++){
            if(topics.get(i).getId().equals(Id)){
                topics.set(i,topic);
            }
        }
    }

    public void deleteTopic(String Id){
        topics.removeIf(t -> t.getId().equals(Id));
    }
}
