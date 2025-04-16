package lib;

public class TaxFunction {

/**
 * Menghitung pajak penghasilan tahunan berdasarkan data pegawai.
 * Pajak = 5% × (Total Penghasilan - Penghasilan Tidak Kena Pajak).
 * - PTKP dasar: Rp54.000.000
 * - Tambahan menikah: Rp4.500.000
 * - Tambahan anak (maks 3): Rp4.500.000 per anak
 */

	
	public static int calculateTax(EmployeeData data) {
    int tax = (data.monthlySalary + data.otherMonthlyIncome) * data.numberOfMonthWorking;
    int nonTaxable = data.deductible + (data.isMarried ? 4500000 : 0) + (data.numberOfChildren * 2000000);
    return (tax - nonTaxable) * 5 / 100;
}
