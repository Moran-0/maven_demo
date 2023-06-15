<template>
  <div id="app">
<!--    <nav>-->
<!--      <router-link to="/">TTTTEST</router-link> |-->
<!--      <router-link to="/about">About</router-link>-->
<!--    </nav>-->
<!--    <router-view/>-->
<!--    <test-view></test-view>-->
<!--    <home-page></home-page>-->
    <home-page></home-page>
  </div>
</template>
<script>


// import TestView from "@/views/TestView.vue";

// import HomePage from "@/views/HomePage.vue";

import HomePage from "@/views/HomePage.vue";

export default{
  components: {HomePage},
  data(){
    return{
      message:"zhe shi shou ye!"
    }
  },
  methods:{

  }
}
</script>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
