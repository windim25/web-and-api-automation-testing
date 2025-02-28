FINAL PROJECT JAYJAY

Project:
Buat automation test framework dan simpan kodenya sebagai repository di GitHub. Automation test framework harus mengandung beberapa aspek yang di ikuti, antara lain :

1. Buatlah test untuk Web UI dan API didalam satu repository
2. Test case untuk Web dan API harus menggunakan Gherkin format, gunakan Cucumber sebagai library untuk implementasinya
3. Buatlah folder atau package terpisah pada Java Code, Step Definitions dan Feature untuk masing-masing jenis test (Web dan API)
4. Buatlah 2 Gradle Task untuk menjalankan fungsi berikut
5. Buatlah report menggunakan Cucumber untuk format HTML dan JSON
6. Buatlah GitHub Actions workflow untuk menjalankan test yang sudah dibuat dengan cara (event) manual trigger dan setiap kali ada Pull Request
7. Jangan lupa tambahkan README file dan berikian setiap informasi penting dari repository kalian, seperti tools dan library yang digunakan, dan bagaimana cara menjalankan test nya

Note:
Untuk Web UI Test gunakan website berikut sebagai target dan pembuatan test scenario: https://www.demoblaze.com/
Untuk API test, gunakan public API berikut:
https://dummyapi.io/docs/user (Get User by ID, Create User, Update User, Delete User)
https://dummyapi.io/docs/tag (Get List of Tags)

Dalam project ini memakai https://www.saucedemo.com/ sebagai pembuatan test scenario automation web
dan https://gorest.co.in/ sebagai automation API test,  https://gorest.co.in/public/v2/users
karena mengalami kendala saat menggunakan https://www.demoblaze.com/ dan https://dummyapi.io/docs/user
