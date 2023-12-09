import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiTestingExample {

    public static void main(String[] args) {
        String apiUrlToTest = "https://jsonplaceholder.typicode.com/todos/1";
        testApiEndpoint(apiUrlToTest);
    }

    public static void testApiEndpoint(String apiUrl) {
        try {
            // Creating an HttpClient
            HttpClient httpClient = HttpClient.newHttpClient();

            // Creating a HttpRequest with the GET method
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .build();

            // Sending the GET request and receiving the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Checking if the response status code is 200 (OK)
            if (response.statusCode() == 200) {
                System.out.println("API Test Passed: Successfully connected to " + apiUrl);

                // You can add more specific validations based on your API response
                // For example, checking if a certain key or value is present in the response JSON

                // Uncomment the following lines to add a more specific validation
                // String responseBody = response.body();
                // if (responseBody.contains("expected_key")) {
                //     System.out.println("Specific validation passed!");
                // }

            } else {
                System.out.println("API Test Failed: Unable to connect to " + apiUrl + ". Status code: " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("API Test Failed: An error occurred - " + e.getMessage());
        }
    }
}
