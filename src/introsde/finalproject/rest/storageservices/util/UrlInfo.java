package introsde.finalproject.rest.storageservices.util;

public class UrlInfo {
	
	public UrlInfo() {}
	
	static final String localDBUrl = "https://nameless-reaches-22539.herokuapp.com/ws/people?wsdl";
	//static final String localDBUrl = "http://127.0.1.1:6902/ws/people?wsdl";
	
	static final String adapterUrl = "https://stark-island-39603.herokuapp.com/sdelab/adapter-service";
	//static final String adapterUrl = "http://127.0.1.1:5702/sdelab/adapter-service";
	
	static final String storageUrl = "http://127.0.1.1:5701/sdelab/storage-service";
	
	/**
	 * This method is used to get the local database url
	 * @return
	 */
	public String getLocalDBURL() {
		return localDBUrl;
	}
	
	/**
	 * This method is used to get the adapter url
	 * @return
	 */
	public String getAdapterURL() {
		return adapterUrl;
	}
	
	/**
	 * This method is used to get the storage url
	 * @return
	 */
	public String getStorageURL() {
		return storageUrl;
	}
}
