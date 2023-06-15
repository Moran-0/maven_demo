<template>
  <div>
    <el-container>
      <el-header>健身房课程管理系统</el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu :default-openeds="['1']">
            <el-submenu index="1">
              <template slot="title"><i class="el-icon-message"></i>导航一</template>
              <el-menu-item-group>
                <el-menu-item index="1-1" @click="menu('/test')">
<!--                  <router-link to="/test"></router-link>-->
                  系统设置
                </el-menu-item>
                <el-menu-item index="1-2">
                  <router-link to="/home">
                    用户管理
                  </router-link>
                </el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main>
            <router-view></router-view>
<!--          <el-row>-->
<!--            <el-button round>圆角按钮</el-button>-->
<!--            <el-button type="primary" round>主要按钮</el-button>-->
<!--            <el-button type="success" round>成功按钮</el-button>-->
<!--            <el-button type="info" round>信息按钮</el-button>-->
<!--            <el-button type="warning" round>警告按钮</el-button>-->
<!--            <el-button type="danger" round>危险按钮</el-button>-->
<!--          </el-row>-->
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "HomePage",
  methods:{
    menu(commentName){
      this.$router.push(commentName);
    }

  }
}
</script>

<style scoped>
.el-header{
  background-color: #97a8be;
  color: #000000;
  text-align: center;
  line-height: 60px;
}
</style>