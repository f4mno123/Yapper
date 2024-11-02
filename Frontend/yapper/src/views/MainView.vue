<script setup>
import Post from '@/components/PostComponent.vue'
</script>

<template>
  <div class="screen">
    <div class="left">
      <div class="links">
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Home</router-link>
          </div>
        </div>
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Home</router-link>
          </div>
        </div>
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Home</router-link>
          </div>
        </div>
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Home</router-link>
          </div>
        </div>
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Explore</router-link>
          </div>
        </div>
        <div class="links_one">
          <div class="links_one_img">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>
          <div class="links_one_router_link">
            <router-link class="router_link_text" to="/about">Notifications</router-link>
          </div>
        </div>
      </div>
    </div>

    <div class="middle">
      <div class="middle_top">
        <div class="middle_top_top">
          <div class="middle_top_top_left">
            <router-link class="router_link_text" to="/about">For you</router-link>
          </div>
          <div class="middle_top_top_right">
            <router-link class="router_link_text" to="/about">Following</router-link>
          </div>
        </div>
        <hr />
        <div class="middle_top_bottom">
          <div class="middle-top_bottom_left">
            <img class="pfp" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
          </div>

          <div class="middle_top_bottom_right">
            <div class="middle_top_bottom_middle">
              <input type="text" placeholder="What's new?" />
            </div>
            <div class="middle_top_bottom_top">
              <input type="submit" value="Search" />
            </div>
          </div>
        </div>
      </div>

      <div class="middle_bottom">
        <Post class="post"/>
      </div>
    </div>

    <div class="right"></div>
  </div>
</template>

<style scoped>
.screen {
  display: flex;
  flex-direction: row;
  height: 100vh;
}

.left {
  background: black;
  width: 20%;
}

.middle {
  width: 60%;
}

.right {
  background: aqua;
  width: 20%;
}

.middle_top {
  background: red;
  height: 20%;
}

.middle_top_top {
  background: blue;
  height: 30%;
  display: flex;
}

.middle_top_top_left, .middle_top_top_right {
  background: black;
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.middle_top_top_left:hover, .middle_top_top_right:hover {
  background: #333;
}

.router_link_text {
  color: white;
  font-size: 20px;
  text-decoration: none;
}

.middle_top_bottom {
  background: black;
  height: 70%;
  display: flex;
  flex-direction: row;
  align-items: center;
}

.middle-top_bottom_left {
  background: black;
  width: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.pfp {
  width: 100px;
  height: 100px;
  border-radius: 50%;
}

.middle_top_bottom_right {
  display: flex;
  flex-direction: column;
  width: 80%;
  justify-content: right;
  align-items: flex-start;
}

.middle_top_bottom_middle {
  width: 100%;
  display: flex;
  align-items: center;
}

input[type="text"] {
  width: 100%;
  height: 7.5vh;
  font-size: 20px;
  border: none;
  background: black;
}

.middle_top_bottom_top {
  margin-top: 8px;
  display: flex;
  justify-content: flex-end;
  width: 100%;
}

input[type="submit"] {
  width: 100px;
  height: 25px;
  font-size: 15px;
  background: #00bfff;
  color: white;
  border: none;
  border-radius: 10px;
}

.bottom {
  background: green;
  height: 80%;
}

.links {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  gap: 15px;
  padding-left: 20px;
}
.links_one {
  background: black;
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: 5%;
  width: 90%;
  padding: 10px;
  cursor: pointer;
  border-radius: 10px;
  transition: background 0.3s;
}

.links_one:hover {
  background: #333;
}

.links_one_img img {
  margin-left: 10%;
  width: 30px;
  height: 30px;
  border-radius: 50%;
}

.links_one_img {
  width: 50%;
  height: 50%;
  display: flex;
  justify-content: center;
}

.links_one_router_link {
  width: 50%;
  height: 50%;
  display: flex;
  align-items: center;
}


.router_link_text {
  color: white;
  font-size: 18px;
  text-decoration: none;
}

.router_link_text:hover {
  color: #1DA1F2;
}

.post {
  display: flex;
  flex-direction: column;
  width: 100%;
  height: 100%;
  border: 1px solid black;
}

</style>
