package restAPI.openWeatherDTO;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DTOWeather {

  @SerializedName("cod")
  @Expose
  private String cod;

  @SerializedName("message")
  @Expose
  private int message;

  @SerializedName("cnt")
  @Expose
  private int cnt;

  @SerializedName("list")
  @Expose
  private java.util.List<restAPI.openWeatherDTO.Result> list = null;

  @SerializedName("city")
  @Expose
  private City city;

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public int getMessage() {
    return message;
  }

  public void setMessage(int message) {
    this.message = message;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public java.util.List<restAPI.openWeatherDTO.Result> getList() {
    return list;
  }

  public void setList(java.util.List<restAPI.openWeatherDTO.Result> list) {
    this.list = list;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(DTOWeather.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("cod");
    sb.append('=');
    sb.append(((this.cod == null) ? "<null>" : this.cod));
    sb.append(',');
    sb.append("message");
    sb.append('=');
    sb.append(this.message);
    sb.append(',');
    sb.append("cnt");
    sb.append('=');
    sb.append(this.cnt);
    sb.append(',');
    sb.append("list");
    sb.append('=');
    sb.append(((this.list == null) ? "<null>" : this.list));
    sb.append(',');
    sb.append("city");
    sb.append('=');
    sb.append(((this.city == null) ? "<null>" : this.city));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }
}
