# The N+1 Query Problem

## What is it?

Imagine you fetch a list of 100 users from the database — that's **1 query**. Then in a loop, for each user you fetch their posts — that's **100 more queries**. Total: **101 queries** instead of just 2. That's the N+1 problem.

```python
# BAD - N+1 problem
users = User.objects.all()       # 1 query
for user in users:
    posts = user.posts.all()     # 1 query per user = N queries
```

---

## The Fix in Django

Use `prefetch_related` or `select_related` to load everything upfront.

```python
# GOOD - 2 queries total
users = User.objects.prefetch_related('posts').all()
for user in users:
    posts = user.posts.all()     # No extra query, data already loaded
```

| Method | Use Case |
|---|---|
| `select_related` | ForeignKey / OneToOne relationships (uses SQL JOIN) |
| `prefetch_related` | ManyToMany or reverse ForeignKey (uses a second query) |

---

## The Fix in SQLAlchemy (FastAPI)

```python
# Use joinedload or selectinload
users = session.query(User).options(joinedload(User.posts)).all()
```

---

## Why It Matters

In production with thousands of records, N+1 can take a fast endpoint from **50ms to 10 seconds**.

Interviewers love this question because it shows you think about **performance**, not just functionality.

---

## Quick Summary

| | Bad (N+1) | Good (Optimized) |
|---|---|---|
| Queries | 101 | 2 |
| Performance | Slow at scale | Fast |
| Django fix | `user.posts.all()` in loop | `prefetch_related('posts')` |
| SQLAlchemy fix | Lazy loading | `joinedload(User.posts)` |
