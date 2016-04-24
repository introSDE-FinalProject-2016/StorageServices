package introsde.finalproject.rest.storageservices.util;

public class UrlInfo {
	
	public UrlInfo() {}
	
	static final String localDBurl = "https://nameless-reaches-22539.herokuapp.com/ws/people?wsdl";
	static final String adapterUrl = "https://desolate-scrubland-21919.herokuapp.com/sdelab/person";
	static final String storageUrl = "";
	
	/**
	 * This method is used to get the local database url
	 * @return
	 */
	public String getLocalDBURL() {
		return localDBurl;
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
