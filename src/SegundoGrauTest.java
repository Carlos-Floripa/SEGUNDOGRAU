import static org.junit.Assert.*;

import org.junit.Test;

public class SegundoGrauTest {
	@Test
	public void DeltaPositivo() throws Exception{
		double delta=SegundoGrau.Delta(new double[] {1,2,-3});
		assertEquals(16,delta,0);
	}
	@Test
	public void DeltaNegativo() throws Exception{
		double delta=SegundoGrau.Delta(new double[] {1,2,3});
		assertEquals(-8,delta,0);
	}
	@Test
	public void TestaCalcula() throws Exception{
		double[] resultado=SegundoGrau.Calcula(new double[] {1,2,-3});
		assertArrayEquals(new double[]{1,-3},resultado,0);
	}
	@Test
	public void TestaConverteNumero() throws Exception{
		double[] resultado=SegundoGrau.Converte("1 2 -3");
		assertArrayEquals(new double[]{1,2,-3},resultado,0);
	}
}
