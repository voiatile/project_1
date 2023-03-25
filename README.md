<h1>Введение</h1>

<h2>Назначение документации</h2>
Документация на приложение BookTrack предназначена для обеспечения полноценного использования программного продукта конечными пользователями и разработчиками. Она предоставляет необходимую информацию об установке, настройке, использовании и техническом обслуживании приложения, а также содержит руководства для программистов, администраторов и пользователей. 
 <p> </p>
Цель настоящей документации - обеспечить удобство использования приложения и его успешную эксплуатацию, а также оказать помощь в решении возникающих проблем и вопросов по использованию.

<h2>Описание приложения и его функциональности</h2>
<em>BookTrack</em> представляет собой инструмент для автоматизации учета книг в библиотеке. Оно позволяет регистрировать читателей, выдавать и возвращать книги, а также хранить информацию о людях и книгах в базе данных. 
На данный момент доступна  </span><code>версия 1.0</code><span>, с возможностью добавления, изменения и удаления человека и книги, списков всех людей и книг, страницы человека с его списком книг и страницы книги с информацией о человеке, который взял эту книгу. В приложении реализована также пагинация и сортировка. По мере развития проекта будут добавляться новые функции
<h2>Целевая аудитория</h2>
Целевая аудитория для приложения BookTrack - это люди, управляющие библиотекой, которые нуждаются в эффективной и удобной системе учета книг и читателей. В частности, это могут быть библиотекари в школах, университетах, общественных библиотеках, частных коллекциях и т.д. 
  <p> </p>

 
<h1>Требования к ПО</h1>

<h2>Список необходимого ПО</h2>
Java Runtime Environment (JRE) v.18 
  <p> </p>
СУБД PostgreSQL версии 9.6 или выше.
  <p> </p>
Интернет-браузер с поддержкой HTML5, такой как Google Chrome, Mozilla Firefox или Safari.
<h2>Системные требования</h2>
Процессор: двухъядерный процессор с частотой не менее 1,6 ГГц.
  <p> </p>
Видеокарта: требования к графической подсистеме отсутствуют
  <p> </p>
Оперативная память: 1 ГБ
  <p> </p>
Место на диске: 500 МБ
  <p> </p>
Операционная система: Windows 7 / 8.1 64-разрядная / macOS 10.15 или новее
<h1>Руководство пользователя</h1>
 Цель данного раздела - помочь пользователю понять, как пользоваться интерфейсом приложения и какие возможности оно предоставляет, чтобы он мог максимально эффективно использовать приложение для своих нужд.
<h2>Структура и функциональность интерфейса</h2>
В данном подразделе нужно описать, как устроен интерфейс приложения и какие функциональные возможности он предоставляет (например, что происходит при нажатии на определенную кнопку или как заполнять поля ввода).
<h2>Описание основных элементов управления</h2>
Привести описание расположения элементов интерфейса на экране (кнопки, поля ввода и т.д.).
<h2>Скриншоты интерфейса</h2>
 В этом разделе можно предоставить скриншоты всех основных окон и форм, которые содержатся в приложении. Кроме того, можно добавить пояснительные комментарии к каждому скриншоту, чтобы обеспечить понимание того, как использовать и взаимодействовать с интерфейсом приложения.
<h2>Описание возможностей приложения</h2>
 <p>Приложение BookTrack </span><code>версии 1.0</code><span>  имеет следующий функционал:</p>
<ul>
<li>Добавление новых книг и читателей в базу данных</li>
<li>Просмотр списка книг с информацией об авторе, названии и годе издания</li>
<li>Редактирование информации о книге и читателе</li>
<li>Удаление книг и читателей из базы данных</li>
<li>Поиск книг по автору или названию</li>
<li>Отображение списка всех читателей и книг</li>
<li>Возможность фильтрации книг по году издания</li>
<li>Сортировка книг по названию, году издания и автору</li>
</ul>
<h2>Инструкция по добавлению, изменению и удалению книг и читателей</h2>
В данном разделе приведены инструкции по регистрации, просмотру, изменению и удалению книг и читателей в приложении BookTrack. <p> </p>
После запуска приложения BookTrack и успешного соединения с базой данных автоматически откроется новое окно в браузере с главной страницей приложения  </span><code>localhost:8080/people</code><span>, где можно увидеть список всех читателей.
 <p><img src="https://user-images.githubusercontent.com/110664019/227725143-8b0dbb2f-071a-4dc1-92c0-899175c9842d.png"/></p>
 
  
<p><strong>Для просмотра всех книг необходимо перейти по адресу&nbsp;</strong>  </span><code>localhost:8080/books</code><span> 
 <p><img src="https://user-images.githubusercontent.com/110664019/227724839-71963374-e68f-45fa-b78c-431236898ba9.png"/></p>

<p><strong>Для регистрации нового читателя необходимо:&nbsp;</strong></p>  <p> </p>
1. Перейти в адресной строке браузера по адресу  </span><code>localhost:8080/people</code><span>  <p> </p>
2. Нажать кнопку  </span><code>Добавить человека</code><span>    <p> </p>
2. Заполнить форму с данными читателя: ФИО, год рождения. <p> </p>
3. Нажать на кнопку </span><code>Create!</code><span>   <p> </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227723944-aa2e4d07-1366-4743-8c56-149152f8142f.png"/></p>

 <p><strong>Для регистрации новой книги необходимо:&nbsp;</strong></p>  <p> </p>
1. Перейти на страницу </span><code>localhost:8080/books/new</code><span>  <p> </p>
2. Заполнить форму с данными книги: название, автор, год издания<p> </p>
3. Нажать на кнопку </span><code>Сreate!</code><span>  <p> </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227724039-36c99a42-8b16-4fe9-beff-b5e858f39883.png"/></p>

 <p><strong>Для изменения данных о книге необходимо:&nbsp;</strong></p>  
1. Перейти на страницу со списком всех книг </span><code>localhost:8080/books</code><span>  </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227724839-71963374-e68f-45fa-b78c-431236898ba9.png"/></p>
2. Найти нужную книгу в списке и выбрать ее путем нажатия левой кнопкой мыши. </p>
3. Изменить нужные данные в форме. </p>
3. Нажать на кнопку </span><code>Update!</code><span>. </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227724102-e6458956-8790-4a28-b65a-150ab5c977ab.png"/></p>

 <p><strong>Для изменения данных о читателе необходимо:&nbsp;</strong></p>  
1. Перейти на страницу со списком всех читателей </span><code>localhost:8080/people</code><span>  </p>
<p><img src="https://user-images.githubusercontent.com/110664019/227725158-dd31442b-a643-43bc-a166-1baaa49e46bf.png"/></p>
2. Найти нужного читателя в списке и выбрать его путем нажатия левой кнопкой мыши</p>
3. Изменить нужные данные в форме. </p>
3. Нажать на кнопку </span><code>Update!</code><span>. </p>
<p><img src="https://user-images.githubusercontent.com/110664019/227723814-2c24c6ad-6724-42ad-8835-26f638f2d652.png"/></p>
 
<h2>Инструкция по выдаче и возврату книг</h2>
<h2>Описание поиска и сортировки книг</h2>

<h1>Руководство системного администратора</h1>

<h2>Описание процесса установки и настройки приложения</h2>
<p dir="auto">Описание процесса установки и настройки приложения BookTrack:</p>
<ol dir="auto">
<li>Загрузить и установить Java Runtime Environment (JRE) версии 8 или выше.</li>
<li>Загрузить и установить PostgreSQL. Для установки PostgreSQL необходимо следовать инструкциям, предоставленным на официальном сайте.</li>
<li>Создать базу данных. Для создания базы данных необходимо выполнить следующие шаги:</li>
</ol>
<ul dir="auto">
<li>Запустите программу psql, введя команду в командной строке: <em>psql.</em></li>
<li>Создайте новую базу данных, введя команду: <em>CREATE DATABASE first_db;</em></li>
<li>Создайте нового пользователя, введя команду: <em>CREATE USER postgres WITH PASSWORD 'admin';</em></li>
<li>Предоставьте пользователю права на базу данных, введя команду: <em>GRANT ALL PRIVILEGES ON DATABASE first_db TO postgres;</em></li>
</ul>
<ol start="4" dir="auto">
<li>В созданной базе данных first_db необходимо создать 2 таблицы со связью <span style="text-decoration: underline;">one-to-many</span>.</li>
</ol>
<p dir="auto">Для создания таблицы <strong>Person&nbsp;</strong> выполните следующие шаги:</p>
<ul dir="auto">
<li>Откройте программу psql и подключитесь к базе данных first_db, используя команду <em>\c first_db</em>.</li>
<li>Создайте таблицу Person, используя следующую команду:</li>
</ul>
<p dir="auto"><code>CREATE TABLE Person ( id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, first_name VARCHAR(50) NOT NULL, surname VARCHAR(50) NOT NULL, patronymic VARCHAR(50), birth_year int NOT NULL );</code></p>
<p dir="auto">Проверьте, что таблица Person была успешно создана, используя команду <em>\d.</em></p>
<p dir="auto">Для создания таблицы <strong>Book&nbsp;</strong> выполните следующие шаги:</p>
<ul dir="auto">
<li>Откройте программу psql и подключитесь к базе данных first_db, используя команду <em>\c first_db</em>.</li>
<li>Создайте таблицу Book, используя следующую команду:</li>
</ul>
<p dir="auto"><code>CREATE TABLE Book ( book_id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, title VARCHAR(100) NOT NULL UNIQUE, author VARCHAR(100) NOT NULL, year int NOT NULL, person_id int REFERENCES Person(id) ON DELETE SET NULL );</code></p>
<p dir="auto">Проверьте, что таблица Book была успешно создана, используя команду <em>\d</em>.</p>
<p dir="auto">В таблице Book добавлено поле person_id, которое является внешним ключом, ссылающимся на поле id таблицы Person. Это позволяет установить связь между таблицами Person и Book и выполнить запросы на выборку данных, связанных с определенным пользователем.</p>
<ol start="5" dir="auto">
<li>Загрузите и распакуйте архив с приложением BookTrack.</li>
<li>Запустите приложение. Для запуска приложения необходимо выполнить следующие шаги:</li>
</ol>
<ul dir="auto">
<li>Открыть терминал в директории, в которую был распакован архив с приложением.</li>
<li>Ввести команду:&nbsp;<em>java -jar booktrack.jar</em></li>
</ul>
<ol start="7" dir="auto">
<li>Настройте подключение к базе данных. Для настройки подключения к базе данных необходимо открыть файл&nbsp;hibernate.properties, расположенный в директории с приложением и ввести необходимые параметры подключения к базе данных:</li>
</ol>
<p dir="auto"><strong><em>hibernate.driver_class=org.postgresql.Driver</em></strong>&nbsp;- указывает драйвер, необходимый для подключения к базе данных postgresql.</p>
<p dir="auto"><strong><em>hibernate.connection.url=jdbc:postgresql://localhost:5432/first_db</em></strong>&nbsp;- указывает URL-адрес базы данных, на которую будет выполняться подключение.</p>
<p dir="auto"><strong><em>hibernate.connection.username=postgres</em></strong><em>&nbsp;</em>- указывает имя пользователя, который будет использоваться при подключении к базе данных.</p>
<p dir="auto"><strong><em>hibernate.connection.password=admin</em></strong>&nbsp;- указывает пароль пользователя, который будет использоваться при подключении к базе данных.</p>
<p dir="auto"><strong><em>hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect</em></strong><em>&nbsp;</em>- указывает диалект базы данных postgresql, который будет использоваться Hibernate для выполнения запросов к базе данных.</p>
<p dir="auto"><strong><em>hibernate.show_sql=true</em></strong>&nbsp;- указывает, что необходимо выводить SQL-запросы в логах приложения.</p>
<p dir="auto">После того, как все параметры настроены, приложение BookTrack будет готово к работе с базой данных first_db.</p>


<h2>Инструкции по установке и настройке приложения на удаленном сервере</h2>
Здесь должно быть приведено подробное описание шагов, которые необходимо выполнить для установки приложения на удаленный сервер. Это может включать в себя установку необходимых компонентов, копирование файлов, настройку параметров приложения и т.д.
<h2>Описание структуры базы данных</h2>
Раздел должен содержать описание всех таблиц и полей, используемых в базе данных приложения, а также описание их взаимосвязей. Это поможет пользователям и администраторам лучше понимать, как данные хранятся в базе и как они могут быть использованы. 
<h2>Методы обеспечения безопасности приложения</h2>
Описание процесса настройки системы безопасности, включая установку прав доступа, защиту от SQL-инъекций, а также настройку брандмауэра
<h2>Описание процедур обновления и резервного копирования</h2>

<p dir="auto">В этом разделе необходимо описать процедуры обновления и резервного копирования приложения и базы данных.</p>
<ol>
Описание процедуры обновления может включать в себя следующие шаги:
<li dir="auto">Создание резервной копии приложения и базы данных</li>
<li dir="auto">Скачивание новой версии приложения</li>
<li dir="auto">Установка новой версии приложения</li>
<li dir="auto">Обновление базы данных в соответствии с новой версией приложения</li>
<li dir="auto">Проверка работоспособности приложения после обновления</li>
</ol>
<p dir="auto">Описание процедуры резервного копирования может включать в себя следующие шаги:</p>
<ol>
<li dir="auto">Определение частоты резервного копирования (ежедневное, еженедельное и т.д.)</li>
<li dir="auto">Определение места хранения резервной копии (локальный диск, облачное хранилище и т.д.)</li>
<li dir="auto">Создание резервной копии базы данных</li>
<li dir="auto">Проверка целостности и доступности резервной копии</li>
<li dir="auto">Проверка работоспособности приложения на основе резервной копии базы данных.</li>
</ol>

<h1>Руководство разработчика</h1>
<h2>Архитектура ПО</h2>
<h3>Описание архитектуры</h3>
<p>Приложение BookTrack состоит из трех основных компонентов: контроллера, сервисного слоя (бизнес-логики) и слоя работы с БД.</p>
<p><br /><span style="text-decoration: underline;"><strong>Контроллер</strong></span> является основным компонентом, который обрабатывает запросы от пользователей и решает, какие данные необходимо получить из сервисного слоя. Контроллер также обрабатывает ошибки и возвращает соответствующие сообщения.<br /><span style="text-decoration: underline;"><strong>Сервисный слой</strong></span> содержит бизнес-логику приложения и является промежуточным слоем между контроллером и слоем работы с БД. Здесь находятся методы, которые обрабатывают запросы от контроллера, проводят нужные операции и возвращают результаты.<br /><span style="text-decoration: underline;"><strong>Слой работы с БД</strong></span> отвечает за взаимодействие с базой данных, включая чтение и запись данных. В приложении BookTrack используется PostgreSQL в качестве БД и Spring DATA JPA для упрощения доступа к данным. Здесь находятся методы для работы с сущностями в БД, такие как сохранение, чтение, обновление и удаление, которые реализованы с помощью JPA-репозиториев и сущностей. Spring DATA JPA позволяет минимизировать объем кода для доступа к БД, а также предоставляет гибкую конфигурацию и маппинг сущностей на таблицы БД.</p>

Диаграмма компонентов и взаимодействия поможет наглядно представить, как компоненты взаимодействуют друг с другом. В приложении BookTrack она выглядит следующим образом:

<p><img src="https://user-images.githubusercontent.com/110664019/227276761-5795c669-d7e7-436d-8f65-94d285143ceb.png"/></p>
На диаграмме компонентов видно, что контроллер взаимодействует с сервисным слоем, который в свою очередь взаимодействует со слоем работы с БД.
<table border="1" style="margin-left: auto; margin-right: auto;">
<tbody>
<tr>
<td><strong>Контроллер</strong></td>
<td><strong>Сервисный слой (Бизнес-Логика)</strong></td>
<td><strong>Слой работы с БД</strong></td>
</tr>
<tr>
<td><span>spring/Controller.java</span></td>
<td><span>spring/BookService.java </span></td>
<td><span>spring/repositories/BookRepository.java</span></td>
</tr>
<tr>
<td></td>
<td><span>spring/PeopleService.java</span></td>
<td><span>spring/repositories/PeopleRepository.java</span></td>
</tr>
</tbody>
</table>

<h2>Описание модулей и компонентов</h2>
В данном разделе приводится подробное описание модулей и компонентов. 

<h2>Диаграммы компонентов и взаимодействия</h2>
<p><span>Здесь можно схематично описать архитектуру приложения, включая компоненты и их взаимодействие.</span></p>
<ul>
<li dir="auto">Компоненты приложения и их функциональное назначение</li>
<li dir="auto">Взаимодействие компонентов и последовательность вызовов методов</li>
<li dir="auto">Зависимости между компонентами и библиотеками и т.д</li>
</ul>
 <h2>Тестирование ПО</h2>
<h3>Описание методов и процедур тестирования</h3>
<ul>
<li>
<p>Описание методов и процедур тестирования для приложения BookTrack:</p>
<ol>
<li>Методы тестирования функциональности:</li>
</ol>
<ul>
<li>Тестирование добавления новой книги в систему</li>
<li>Тестирование добавления нового читателя в систему</li>
<li>Тестирование поиска книги по названию, автору и году выпуска</li>
<li>Тестирование выдачи книги читателю</li>
<li>Тестирование возврата книги читателем</li>
<li>Тестирование удаления книги из системы</li>
<li>Тестирование удаления читателя из системы</li>
<li>Тестирование обновления данных о книге</li>
<li>Тестирование обновления данных о читателе</li>
</ul>
<ol start="2">
<li>Методы тестирования производительности:</li>
</ol>
<ul>
<li>Тестирование скорости поиска книги в базе данных</li>
<li>Тестирование скорости выдачи книги читателю</li>
<li>Тестирование скорости возврата книги читателем</li>
<li>Тестирование скорости обновления данных о книге</li>
<li>Тестирование скорости обновления данных о читателе</li>
</ul>
<ol start="3">
<li>Методы тестирования безопасности:</li>
</ol>
<ul>
<li>Тестирование защиты приложения от SQL-инъекций</li>
<li>Тестирование корректности обработки ошибок и исключений</li>
</ul>
<ol start="4">
<li>Методы тестирования совместимости:</li>
</ol>
<ul>
<li>Тестирование совместимости приложения с различными операционными системами (Windows, Linux, Mac)</li>
<li>Тестирование совместимости приложения с различными версиями Java</li>
<li>Тестирование совместимости приложения с различными СУБД (PostgreSQL, MySQL, Oracle)</li>
</ul>
</li>
</ul>
<h3>Результаты тестирования</h3>
<ul>
<li>В этом разделе следует предоставить информацию о результатах тестирования, которые были получены в процессе тестирования. Например, следует указать количество найденных ошибок и дефектов, а также описать, как они были исправлены.</li>
<li>Также следует описать любые проблемы, которые были выявлены в процессе тестирования. Например, это могут быть проблемы с производительностью, неработающие функции, проблемы совместимости и т.д.</li>
</ul>
<h1>Список использованных технологий</h1>
  <h2>Технологии, которые использовались для реализации</h2>
<ul dir="auto">
<li><a href="https://docs.oracle.com/en/java/javase/18/docs/api/java.base/module-summary.html">Java 18</a></li>
<li><a href="https://maven.apache.org/guides/">Maven</a></li>
<li><a href="https://docs.spring.io/spring-boot/docs/current/reference/html/">Spring Boot</a></li>
<li><a href="https://hibernate.org/orm/documentation/6.1/">Hibernate</a></li>
<li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/">Spring Data JPA</a></li>
<li><a href="https://www.thymeleaf.org/documentation.html">Thymeleaf</a></li>
<li><a href="https://www.postgresql.org/docs/">PostgreSQL</a></li>
</ul>
 <h2>Версии используемых библиотек и фреймворков</h2> 
<h1>Список литературы</h1>
  <h2>Список использованной литературы и ресурсов</h2>
