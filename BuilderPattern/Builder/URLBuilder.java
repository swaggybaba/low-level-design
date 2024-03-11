package Builder;


public class URLBuilder {
	private String protocol;
	private String hostName;
	private String port;
	private String pathParam;
	private String queryParam;
	
	public static class Builder{
		private String protocol;
		private String hostName;
		private String port;
		private String pathParam;
		private String queryParam;
		
		public Builder protocol(String protocol) {
			this.protocol=protocol;
			return this;
		}
		
		public Builder hostName(String hostName) {
			this.hostName=hostName;
			return this;
		}
		
		public Builder port(String port) {
			this.port=port;
			return this;
		}
		
		public Builder pathParam(String pathParam) {
			this.pathParam=pathParam;
			return this;
		}
		
		public Builder queryParam(String queryParam) {
			this.queryParam=queryParam;
			return this;
		}
		
		public URLBuilder build() {
			return new URLBuilder(this);
		}
	}
	
	public URLBuilder(Builder builder) {
		this.protocol=builder.protocol;
		this.hostName=builder.hostName;
		this.port=builder.port;
		this.pathParam=builder.pathParam;
		this.queryParam=builder.queryParam;
	}
	
	public String toString() {
		return protocol+"/"+hostName+"/"+port+"/"+pathParam+"/"+queryParam;
	}
}
