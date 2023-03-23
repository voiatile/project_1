<h1>BookTrack</h1>
<em>BookTrack</em> представляет собой бесплатный веб-инструмент для автоматизации учета книг в библиотеке. Оно позволяет регистрировать читателей, выдавать и возвращать книги, а также хранить информацию о людях и книгах в базе данных. 
На данный момент доступна  </span><code>версия 1.0</code><span>, с возможностью добавления, изменения и удаления человека и книги, списков всех людей и книг, страницы человека с его списком книг и страницы книги с информацией о человеке, который взял эту книгу. В приложении реализована также пагинация и сортировка. По мере развития проекта будут добавляться новые функции
  <p> </p>
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
  
  <h2>Архитектура</h2>
 ![Снимок экрана 2023-03-23 в 23 49 06](https://user-images.githubusercontent.com/110664019/227276761-5795c669-d7e7-436d-8f65-94d285143ceb.png)

  Контроллер
  Сервисный слой
  Бизнес-Логика
