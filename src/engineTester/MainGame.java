package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayManager.CreateDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		
		float[] vertices = {
				-0.5f, 0.5f, 0,
				-0.5f, -0.5f, 0,
				0.5f, -0.5f, 0,
				0.5f, 0.5f, 0f,
		};
		
		int[] indices = {
				0,1,3,
				3,1,2
		};
		RawModel model = loader.loadToVAO(vertices, indices);
		while(!Display.isCloseRequested()){
			renderer.prepare();
			renderer.render(model);
			DisplayManager.updateDisplay();
		}
		loader.cleanUp();
		DisplayManager.closeDisplay();
	}

}
