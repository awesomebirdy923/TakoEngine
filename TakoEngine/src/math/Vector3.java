package math;

public class Vector3 {

	public float x;
	public float y;
	public float z;
	
	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Vector3 add(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
	}
	
	public static Vector3 sub(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
	}
	
	public static Vector3 mult(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
	}
	
	public static Vector3 div(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
	}
	
	public void add(Vector3 v) {
		x+=v.x;
		x+=v.y;
		x+=v.z;
	}
	public void sub(Vector3 v) {
		x-=v.x;
		x-=v.y;
		x-=v.z;
	}
	public void mult(Vector3 v) {
		x*=v.x;
		x*=v.y;
		x*=v.z;
	}
	public void div(Vector3 v) {
		x/=v.x;
		x/=v.y;
		x/=v.z;
	}
	
	
}
