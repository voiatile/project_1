<h1>Введение</h1>

<h2>Назначение документации</h2>
Документация на приложение BookTrack предназначена для обеспечения полноценного использования программного продукта конечными пользователями и разработчиками. Она предоставляет необходимую информацию об установке, настройке, использовании и техническом обслуживании приложения, а также содержит руководства для программистов, администраторов и пользователей. 
 <p> </p>
Цель настоящей документации - обеспечить удобство использования приложения и его успешную эксплуатацию, а также оказать помощь в решении возникающих проблем и вопросов по использованию.

<h2>Описание приложения и его функциональности</h2>
<em>BookTrack</em> представляет собой бесплатный веб-инструмент для автоматизации учета книг в библиотеке. Оно позволяет регистрировать читателей, выдавать и возвращать книги, а также хранить информацию о людях и книгах в базе данных. 
На данный момент доступна  </span><code>версия 1.0</code><span>, с возможностью добавления, изменения и удаления человека и книги, списков всех людей и книг, страницы человека с его списком книг и страницы книги с информацией о человеке, который взял эту книгу. В приложении реализована также пагинация и сортировка. По мере развития проекта будут добавляться новые функции
<h2>Целевая аудитория</h2>
Целевая аудитория для приложения BookTrack - это люди, управляющие библиотекой, которые нуждаются в эффективной и удобной системе учета книг и читателей. В частности, это могут быть библиотекари в школах, университетах, общественных библиотеках, частных коллекциях и т.д. Также приложение может быть полезным читателям, которые хотят узнать, какие книги они уже взяли, и когда их нужно вернуть.
  <p> </p>

 
<h1>Требования к ПО</h1>

<h2>Список необходимого ПО</h2>
Java Runtime Environment (JRE) v.18 
  <p> </p>
СУБД PostgreSQL версии 9.6 или выше.
  <p> </p>
Интернет-браузер с поддержкой JavaScript и HTML5, такой как Google Chrome, Mozilla Firefox или Safari.
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
<h1>Инструкция пользователя</h1>
 Цель данного раздела - помочь пользователю понять, как пользоваться интерфейсом приложения и какие возможности оно предоставляет, чтобы он мог максимально эффективно использовать приложение для своих нужд.
<h2>Структура и функциональность интерфейса</h2>
В данном подразделе нужно описать, как устроен интерфейс приложения и какие функциональные возможности он предоставляет (например, что происходит при нажатии на определенную кнопку или как заполнять поля ввода).
<h2>Описание основных элементов управления</h2>
Привести описание расположения элементов интерфейса на экране (меню, кнопки, поля ввода и т.д.).
<h2>Скриншоты интерфейса</h2>
<h2>Описание возможностей приложения</h2>
<h2>Инструкция по добавлению, регистрации, изменению и удалению книг и читателей</h2>
В данном разделе приведены инструкции по регистрации, добавлению, изменению и удалению книг и читателей в приложении BookTrack. <p> </p>
Для регистрации нового читателя необходимо: <p> </p>
1. Перейти на страницу </span><code>/people/new</code><span>  <p> </p>
2. Заполнить форму с данными читателя: ФИО, год рождения. <p> </p>
3. Нажать на кнопку "Create!". <p> </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227716171-bb7c9cf6-7789-4839-b7c2-75bed5b5ad62.png"/></p>

Для регистрации новой книги необходимо:<p> </p>
1. Перейти на страницу </span><code>/books/new</code><span>  <p> </p>
2. Заполнить форму с данными книги: название, автор, год издания<p> </p>
3. Нажать на кнопку "Создать".<p> </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227716335-29c93da8-efd3-4124-ac1a-1d39b8594f2a.png"/></p>

 
Для изменения данных о книге необходимо:
1. Перейти на страницу со списком всех книг </span><code>/books</code><span>  </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227716532-dfc38fe6-e4f1-48fa-a324-219586b164b7.png"/></p>
2. Найти нужную книгу в списке и выбрать ее. </p>
3. Изменить нужные данные в форме. </p>
3. Нажать на кнопку "Редактировать". </p>
 <p><img src="https://user-images.githubusercontent.com/110664019/227716508-05d4280e-f426-4f29-a184-0028bae1bee5.png"/></p>

Для изменения данных о читателе необходимо:
1. Перейти на страницу со списком всех читателей </span><code>/people</code><span>  </p>
<p><img src="https://user-images.githubusercontent.com/110664019/227716818-16394d76-4ace-4852-81eb-fdd6439aa913.png"/></p>
2. Выбрать читателя в списке и перейти на страницу для внесения изменений</p>
3. Изменить нужные данные в форме. </p>
3. Нажать на кнопку "Редактировать". </p>
<p><img src="https://user-images.githubusercontent.com/110664019/227716910-dd002d1b-75d2-41da-a62f-7881e19db96c.png"/></p>
 
 
<h2>Инструкция по выдаче и возврату книг</h2>
<h2>Описание пагинации и сортировки</h2>
<h1>Руководство системного администратора</h1>
  <h2>Описание процесса установки и настройки приложения</h2>
  <h2>Инструкции по установке и настройке приложения на сервере</h2>
<h2>Описание структуры базы данных</h2>
<h2>Методы обеспечения безопасности приложения</h2>
<h2>Описание процедур обновления и резервного копирования</h2>
<h1>Руководство программиста</h1>
  <h2>Архитектура ПО</h2>
  <h3>Описание архитектуры</h3>
  <p><img src="https://user-images.githubusercontent.com/110664019/227276761-5795c669-d7e7-436d-8f65-94d285143ceb.png"/></p>

<table border="1" style="border-collapse: collapse; width: 100%; height: 108px;">
<tbody>
<tr style="height: 36px;">
<td style="width: 33.333333333333336%; height: 36px;"><strong>Контроллер</strong></td>
<td style="width: 33.333333333333336%; height: 36px;"><strong>Сервисный слой (Бизнес-Логика)</strong></td>
<td style="width: 33.333333333333336%; height: 36px;"><strong>Слой работы с БД</strong></td>
</tr>
<tr style="height: 18px;">
<td style="width: 33.333333333333336%; height: 18px;"><span>spring/Controller.java</span></td>
<td style="width: 33.333333333333336%; height: 18px;"><span>spring/BookService.java </span></td>
<td style="width: 33.333333333333336%; height: 18px;"><span>spring/repositories/BookRepository.java</span></td>
</tr>
<tr style="height: 18px;">
<td style="width: 33.333333333333336%; height: 18px;"></td>
<td style="width: 33.333333333333336%; height: 18px;"><span>spring/PeopleService.java</span></td>
<td style="width: 33.333333333333336%; height: 18px;"><span>spring/repositories/PeopleRepository.java</span></td>
</tr>
<tr style="height: 18px;">
<td style="width: 33.333333333333336%; height: 18px;"></td>
<td style="width: 33.333333333333336%; height: 18px;"></td>
<td style="width: 33.333333333333336%; height: 18px;"></td>
</tr>
<tr style="height: 18px;">
<td style="width: 33.333333333333336%; height: 18px;"></td>
<td style="width: 33.333333333333336%; height: 18px;"></td>
<td style="width: 33.333333333333336%; height: 18px;"></td>
</tr>
</tbody>
</table>
<h2>Описание модулей и компонентов</h2>
<h2>Диаграммы компонентов и взаимодействия</h2>
 <h2>Тестирование ПО</h2>
<h3>Описание методов и процедур тестирования</h3>
<h3>Результаты тестирования</h3>
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
