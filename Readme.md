todo app
1. User can login and register
2. left side menu: all tasks, completed, in progess, today, tommorow, month
3. user can create/update/remove tasks
4. removed tasks will be in trash.
5. after 30 days, trashed tasks will be removed completely
6. tasks can be in plain text or rich text
7. for rich text, use rich text editor.
8. a task has title, description, date picker, time picker, importance, allow notification
9. Notification can be sent in chrome notification, email etc.
10. Admin user can see how many users are registered or logged in in a day/month etc.
11. Admin user can see how many tasks are
12. User can search/sort
13. Users can view analytics of his own.

https://codecanyon.net/item/todo-list-react-js/30149679

Task
* id
* title
* isRich
* description
* created by(user id)
* status (todo, in progress, completed, deleted)
* start date
* end date
* importance level
* allow notification
* notification channel
*  additional owner(user id - one to many)

Notification
* title
* description
* sentDateTime
* status
* channel

User
* name
* phone
* email
* createdDate
* updatedDate
* role

Api endpoints
GET /api/user/{id}
GET /api/user
PUT /api/user/{id}
DELETE /api/user/{id}

GET /api/user/{id}/task
GET /api/user/{id}/task/{id}?sort={}&page={}&size={}
PUT /api/user/{id}/task/{id}
DELETE /api/user/{id}/task/{id}
GET /api/user/{id}/task?search




