```
// test getting all Droplets 

String url = ENDPOINT.replace("COMMAND", "droplets");
url = url.replace("CLIENT_ID", CLIENT_ID);
url = url.replace("API_KEY", API_KEY);

final String jsonResponse = fetchString(url);

// parse JSON response

final Droplets droplets = GSON.fromJson(jsonResponse, Droplets.class);

System.out.println("Droplets: query status = " + droplets.getStatus());
System.out.println("Droplets: raw response = " + jsonResponse);

```
