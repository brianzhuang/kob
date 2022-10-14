<template>
  <NavBar />
  <router-view></router-view>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'

export default {
  components: {
    NavBar
  },
  setup() {
    $.ajax({
      url:"http://localhost:3000/user/account/token/",
      type: "post",
      data: {
        username: 'brian',
        password: 'Zjw19901213',
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

    $.ajax({
      url:"http://localhost:3000/user/account/info/",
      type: "get",
      headers: {
        Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyMDFhZTA3Nzk5YzI0NDgwODg4YzdlOTQ1YTkzYzJkOSIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY2NTcwODIyMywiZXhwIjoxNjY2OTE3ODIzfQ.dH4M3EF03oxfregf4RV-Or57FoZGZLq0-MOVvLknceI",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

    $.ajax({
      url:"http://localhost:3000/user/account/register/",
      type: "post",
      data: {
        username: 'brian',
        password: '123456',
        confirmedPassword: '123456'
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    })


  }
}
</script>

<style>
</style>
