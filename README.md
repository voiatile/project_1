<h1>Введение</h1>
<h2>Назначение документации</h2>
<h2>Описание приложения и его функциональности</h2>
<em>BookTrack</em> представляет собой бесплатный веб-инструмент для автоматизации учета книг в библиотеке. Оно позволяет регистрировать читателей, выдавать и возвращать книги, а также хранить информацию о людях и книгах в базе данных. 
На данный момент доступна  </span><code>версия 1.0</code><span>, с возможностью добавления, изменения и удаления человека и книги, списков всех людей и книг, страницы человека с его списком книг и страницы книги с информацией о человеке, который взял эту книгу. В приложении реализована также пагинация и сортировка. По мере развития проекта будут добавляться новые функции
<h2>Целевая аудитория</h2>

  <p> </p>

  
  <h1>Архитектура ПО</h1>
  <h2>Описание архитектуры</h2>
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

<h1>Требования к ПО</h1>
<h1>Инструкция пользователя</h1>
<h1>Руководство системного администратора</h1>
<h1>Тестирование ПО</h1>
<h1>Список использованных технологий</h1>
  <h2>Технологии, которые использовались для реализации:</h2>
<ul dir="auto">
<li><a href="https://docs.oracle.com/en/java/javase/18/docs/api/java.base/module-summary.html">Java 18</a></li>
<li><a href="https://maven.apache.org/guides/">Maven</a></li>
<li><a href="https://docs.spring.io/spring-boot/docs/current/reference/html/">Spring Boot</a></li>
<li><a href="https://hibernate.org/orm/documentation/6.1/">Hibernate</a></li>
<li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/">Spring Data JPA</a></li>
<li><a href="https://www.thymeleaf.org/documentation.html">Thymeleaf</a></li>
<li><a href="https://www.postgresql.org/docs/">PostgreSQL</a></li>
</ul>
<h1>Список литературы</h1>
