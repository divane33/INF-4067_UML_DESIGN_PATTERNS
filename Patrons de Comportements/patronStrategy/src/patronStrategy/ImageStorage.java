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
				// appeler la méthode de compression adaptée aux images JPEG.
				System.out.println("Compression spécifique à JPEG");
				else if("png".equals(compressor))
				// appeler la méthode de compression adaptée aux images PNG.
				System.out.println("Compression spécifique à PNG");
				
				if("high-contrast".equals(filter))
				System.out.println("Applying high contrast filter");
				else if("BnW".equals(filter))
				System.out.println("Applying black and white contrast filter");
				
			}
}
