package DesignPatterns.CreationalDesignPatterns.Builder;

public class HttpRequest {

    private String url;
    private String method;
    private String token;
    private String apiKey;
    private int clientId;

    private HttpRequest(HttpRequestBuilder httpRequestBuilder){
        this.url = httpRequestBuilder.url;
        this.apiKey= httpRequestBuilder.apiKey;
        this.method = httpRequestBuilder.method;
        this.token = httpRequestBuilder.token;
        this.clientId = httpRequestBuilder.clientId;

    }



    public static class HttpRequestBuilder{


        private String url;
        private String method;
        private String token;
        private String apiKey;
        private int clientId;  // optional

        public  HttpRequestBuilder(String url,String method){
            this.url= url;
            this.method= method;
        }
        public HttpRequestBuilder clientId(int clientId){
            this.clientId = clientId;
            return this;

        }

        public HttpRequestBuilder token(String token){
            this.token = token;
            return this;

        }
        public HttpRequestBuilder apikey(String apiKey){
            this.apiKey = apiKey;
            return this;

        }

        public HttpRequest build(){
            return new HttpRequest(this);

        }


    }

}
