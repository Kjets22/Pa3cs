package com.example.javafxphotos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Photo implements Serializable {
    String location;
    private List<Tag> tags = new ArrayList<>();
    private List<Album> albums = new ArrayList<>();
    private static final long serialVersionUID = 1L;
    public Photo(String location){
        this.location = location;
    }


    /**
     * @return String
     */
    public String getLocation(){
        return location;
    }

    public void setTags(List<Tag> newTags){
        tags = newTags;
    }
    public List<Tag> getTags(){
        return tags;
    }

    public List<Album> getAlbums(){
        return albums;
    }
    public void add_tag(Tag e){
        getTags().add(e);
    }

    public void add_album(Album e){
        albums.add(e);
    }

    public void delete_tag(String value, String name){
        for (Tag tag : tags){
            if(value == tag.getName() && name == tag.getValue()){
                tags.remove(tag);
            }
        }
    }

}
