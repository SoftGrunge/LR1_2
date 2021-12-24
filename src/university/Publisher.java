package university;

public class Publisher {
    private String publisherName;
    private String city;

    public Publisher (String publisherName, String city){
        setPublisherName(publisherName);
        setCity(city);
    }
    public String getPublisherName(){
        return publisherName;
    }
    public String getCity(){
        return city;
    }

    public void setPublisherName(String publisherName) {
        if (publisherName == null && publisherName.isEmpty()) {
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.publisherName = publisherName;
        }

        public void setCity (String city){
        if (city != null && ! city.isEmpty()){
            this.city = city;
        }

    }


}
