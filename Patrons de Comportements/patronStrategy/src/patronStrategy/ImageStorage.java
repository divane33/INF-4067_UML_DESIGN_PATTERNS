package patronStrategy;

public class ImageStorage {
	
		private String compressor;
		private String filter;
		
			public ImageStorage(String compressor, String filter) {
				this.compressor = compressor;
				this.filter = filter;
			}
			
			public void store(String fileName){
				
				if("jpeg".equals(compressor))
				// appeler la m�thode de compression adapt�e aux images JPEG.
				System.out.println("Compression sp�cifique � JPEG");
				else if("png".equals(compressor))
				// appeler la m�thode de compression adapt�e aux images PNG.
				System.out.println("Compression sp�cifique � PNG");
				
				if("high-contrast".equals(filter))
				System.out.println("Applying high contrast filter");
				else if("BnW".equals(filter))
				System.out.println("Applying black and white contrast filter");
				
			}
}
