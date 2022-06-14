<template>
  <div class="container">
  <h1 class="text-center mt-5">Sentence Analyzer</h1>
    <div>
    <input type="text" v-model="sentence" placeholder="Enter Sentence">
    <button @click="post" class="btn btn-primary" >Analyze</button>
    <div class="card">
    <div class="card-body">
      <ul class="list-group">
        <a v-for="(results,index) in results" :key="index"></a>
        <h3 class="text-center mt-5">The sentence have: {{ results.numberOfWords }} word</h3>
        <h3 class="text-center mt-5">Frequency of word: {{ results.frequency }}</h3>
        <h3 class="text-center mt-5">Number of latter in the word: {{ results.lengthOfWords }}</h3>
</ul>


    </div>
</div>
    
    
   
  </div>
  </div>
</template>

<script>
import axios from "axios"
import { get } from "http";

export default{

  data() {
    return {
      sentence:"",
      results:[]
  
    }
  },
  methods:{  


    
      post(){
            const s={sentence:this.sentence};
            

      axios.post("http://localhost:8081/getSentence/sentence",s)
      .then(response =>{
        (this.results=response.data)
      })

    },


  }
};
</script>

