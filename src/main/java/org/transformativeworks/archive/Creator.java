package org.transformativeworks.archive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Creator {
  private Long id;
  @JsonProperty("display_name")
  private String displayName;
  private Long user_id;
  private String username;
  private URL url;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }
}
