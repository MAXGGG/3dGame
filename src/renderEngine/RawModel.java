package renderEngine;

public class RawModel {
	
	private int vaoID;
	private int vertexCount;
	
	public RawModel(int vaoId, int vertextCount){
		this.vaoID = vaoId;
		this.vertexCount = vertextCount;
	}

	public int getVaoID() {
		return vaoID;
	}

	public int getVertexCount() {
		return vertexCount;
	}
	
	

}
