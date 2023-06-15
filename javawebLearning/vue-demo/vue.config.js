const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    // 项目启动端口之后会变成3000
    port: 8090,
  },
})
