import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaAnswer {
    String date;
    String explanation;
    String media_type;
    String service_version;
    String title;
    String url;
    String copyright;
    String hdurl;

    public NasaAnswer(@JsonProperty("date") String date,
                      @JsonProperty("explanation") String explanation,
                      @JsonProperty("media_type") String media_type,
                      @JsonProperty("service_version") String service_version,
                      @JsonProperty("title") String title,
                      @JsonProperty("url") String url,
                      @JsonProperty("copyright") String copyright,
                      @JsonProperty("hdurl") String hdurl) {

        this.date = date;
        this.explanation = explanation;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
        this.url = url;
    }
}
