# UTS MKPL - Refactoring Long Parameter List

🙌 Kontributor
Nama: Ade Fatkhul Anam
NIM: 2211104051

## 📌 Deskripsi
Repositori ini dibuat untuk memenuhi Ujian Tengah Semester (UTS) Mata Kuliah **Manajemen Konfigurasi dan Perawatan Perangkat Lunak (MKPL)**.  
Topik yang dikerjakan adalah **refactoring bad smell** _Long Parameter List_ dengan pendekatan **Introduce Parameter Object**.

## 🧠 Identifikasi Bad Smell
- **Masalah**: Konstruktor `Employee` memiliki terlalu banyak parameter (Long Parameter List).
- **Risiko**: Sulit dipelihara, membingungkan, dan rawan kesalahan saat membuat objek baru.

## 🔧 Solusi Refactoring
- Diperkenalkan class baru: `EmployeeData`.
- `EmployeeData` berfungsi sebagai objek parameter untuk menyederhanakan konstruktor `Employee`.
- Konstruktor `Employee` diubah agar hanya menerima satu parameter berupa objek `EmployeeData`.

### 💡 Contoh Sebelum Refactor:
```java
public Employee(String name, int age, String address, String phoneNumber, String email, String position) {
    // ...
}

✅ Setelah Refactor:

public Employee(EmployeeData data) {
    // ...
}

🗂️ Struktur Branch dan Commit
Branch utama: main

Branch refactor: LongParameterList-EmployeeConstructor

Total beberapa merge dilakukan untuk mensimulasikan collaborative workflow.

Commit dilakukan secara bertahap:

Menambahkan class EmployeeData

Refactor konstruktor

Hapus field lama

Tambahkan dokumentasi dan komentar

